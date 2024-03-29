import { Component, OnInit } from '@angular/core';
import { ErrorStateMatcher } from '@angular/material/core';

import { Router } from '@angular/router';
import { ApiService } from '../api.service';
import { FormControl, FormGroupDirective, FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';

/** Error when invalid control is dirty, touched, or submitted. */
export class MyErrorStateMatcher implements ErrorStateMatcher {
  isErrorState(control: FormControl | null, form: FormGroupDirective | NgForm | null): boolean {
    const isSubmitted = form && form.submitted;
    return !!(control && control.invalid && (control.dirty || control.touched || isSubmitted));
  }
}

@Component({
  selector: 'app-classes-add',
  templateUrl: './accounts-add.component.html',
  styleUrls: ['./accounts-add.component.css']
})
export class AccountsAddComponent implements OnInit {

	constructor(private router: Router, private api: ApiService, private formBuilder: FormBuilder) { }

	classForm: FormGroup;
	name = '';
  accountNum = '';
  customer = '';
	isLoadingResults = false;
	submitErrMsg = '';
	submitErr = false;
	CStatus: any =  [{'name': 'opened'}, {'name': 'closed'}];

	matcher = new MyErrorStateMatcher();

	onFormSubmit() {
	  this.isLoadingResults = true;
	  this.api.addClass(this.classForm.value)
	    .subscribe(res => {
	    	if (res['code']){
		      	this.router.navigate(['/accounts']);
		    }else{
		    	this.submitErr = true;
		    	this.submitErrMsg = 'something went worng';
		    	console.log(res);
		    }
	        this.isLoadingResults = false;
	      }, (err: any) => {
	        console.log(err);
	        this.isLoadingResults = false;
	      });
	}

	ngOnInit() {
		this.classForm = this.formBuilder.group({
      'name' : [null, Validators.required],
      'accountNum' : [null, Validators.required],
      'customer' : [null, Validators.required],
		  });
	}

}
