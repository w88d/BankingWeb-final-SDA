import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AccountsComponent } from './accounts/accounts.component';
import { AccountsAddComponent } from './accounts-add/accounts-add.component';
import { AccountsEditComponent } from './accounts-edit/accounts-edit.component';

const routes: Routes = [
  {
    path: 'accounts',
    component: AccountsComponent,
    data: { title: 'List of accounts' }
  },
  {
    path: 'accounts-add',
    component: AccountsAddComponent,
    data: { title: 'Add accounts' }
  },
  {
    path: 'accounts-edit/:id',
    component: AccountsEditComponent,
    data: { title: 'Edit accounts' }
  },
  { path: '',
    redirectTo: '/accounts',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
