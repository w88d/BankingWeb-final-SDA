import { Component, OnInit } from '@angular/core';
import { ErrorStateMatcher } from '@angular/material/core';

import { Router, ActivatedRoute } from '@angular/router';
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
  selector: 'app-classes-edit',
  templateUrl: './accounts-edit.component.html',
  styleUrls: ['./accounts-edit.component.css']
})
export class AccountsEditComponent implements OnInit {

	constructor(private router: Router, private route: ActivatedRoute, private api: ApiService, private formBuilder: FormBuilder) { }

	classForm: FormGroup;
	id = 0;
  name = '';
  accountNum = '';
  customer = '';
	isLoadingResults = false;
	submitErrMsg = [];
	submitErr = false;
	clsErrMsg = '';
	clsErr = false;
	CStatus: any =  [{'name': 'opened'}, {'name': 'closed'}];

	matcher = new MyErrorStateMatcher();

	getClass(id: any) {
	  this.api.getClass(id).subscribe(res => {
	  	this.isLoadingResults = false;
	  	if (res){
	      	let data = res['data'];
          console.log(data, 'fffffffffffffffffffffffffffff')
	      	this.id = data.id;
		    this.classForm.setValue({
		      name: data.name,
		      accountNum: data.accountNum,
		      customer: data.customer,
		    });
	    }else{
	    	this.clsErr = true;
	    	this.clsErrMsg = res['response'];
	    	console.log(res);
	    }
	  });
	}

	ngOnInit() {
		this.isLoadingResults = true;
		this.getClass(this.route.snapshot.params['id']);
		this.classForm = this.formBuilder.group({
		    'name' : [null, Validators.required],
		    'accountNum' : [null, Validators.required],
		    'customer' : [null, Validators.required],
		  });
	}

	onFormSubmit() {
	  this.isLoadingResults = true;
	  this.api.updateClass(this.id, this.classForm.value)
	    .subscribe(res => {
	    	if (res){
		      	let data = res['data'];
		      	this.router.navigate(['/classes', data.id]);
		    }else{
		    	this.submitErr = true;
		    	this.submitErrMsg = res['response'];
		    	console.log(res);
		    }
	        this.isLoadingResults = false;
	      }, (err: any) => {
	        console.log(err);
	        this.isLoadingResults = false;
	      }
	    );
	}

}
