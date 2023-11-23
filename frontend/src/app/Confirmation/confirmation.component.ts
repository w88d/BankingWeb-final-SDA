import { Component } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-confirmation-dialog',
  template: `
        <h2 mat-dialog-title>Confirmation</h2>
        <mat-dialog-content>Are you sure you want to delete this record?</mat-dialog-content>
        <mat-dialog-actions>
            <button mat-button mat-dialog-close>No</button>
            <button mat-button [mat-dialog-close]="true">Yes</button>
        </mat-dialog-actions>
    `
})
export class ConfirmationDialogComponent {
  constructor(public dialogRef: MatDialogRef<ConfirmationDialogComponent>) {}
}
