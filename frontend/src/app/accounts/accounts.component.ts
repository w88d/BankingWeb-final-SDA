import { Component, OnInit } from '@angular/core';

import { ApiService } from '../api.service';
import { MatDialog } from '@angular/material/dialog';

import { Accounts } from '../accounts';
import {ConfirmationDialogComponent} from "../Confirmation/confirmation.component";

@Component({
  selector: 'app-classes',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent implements OnInit {

	constructor(private api: ApiService,private dialog: MatDialog) { }

	displayedColumns: string[] = ['id', 'name', 'accountNum', 'action'];
	data: Accounts[] = [];
	isLoadingResults = true;

	ngOnInit() {
	  this.api.getClasses()
	    .subscribe(res => {
	      if (res){
	      	this.data = res['data'];
	      }
	      console.log(this.data);
	      console.log(res);
	      this.isLoadingResults = false;
	    }, err => {
	      console.log(err);
	      this.isLoadingResults = false;
	    });
	}

  openConfirmationDialog(id: any): void {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent);
    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        this.deleteRecord(id);
      }
    });
  }

  deleteRecord(id: any): void {
    this.api.deleteClass(id).subscribe(
      response => {
        this.api.getClasses()
          .subscribe(res => {
            if (res){
              this.data = res['data'];
            }
            console.log(this.data);
            console.log(res);
            this.isLoadingResults = false;
          }, err => {
            console.log(err);
            this.isLoadingResults = false;
          });
        console.log('Record deleted successfully', response);
      },
      error => {
        console.error('Error deleting record', error);
      }
    );
  }
}
