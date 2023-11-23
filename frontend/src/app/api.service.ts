import { Injectable } from '@angular/core';
import { Observable, of, throwError } from 'rxjs';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { catchError, tap, map } from 'rxjs/operators';
import { Accounts } from './accounts';
import { Response } from './response';

const httpOptions = {
	  headers: new HttpHeaders({'Content-Type': 'application/json'})
	};
const apiUrl = 'http://127.0.0.1:8000/api';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

	constructor(private http: HttpClient) { };

	private handleError<T> (operation = 'operation', result?: T) {
		return (error: any): Observable<T> => {

		  // TODO: send the error to remote logging infrastructure
		  console.error(error); // log to console instead

		  // Let the app keep running by returning an empty result.
		  return of(result as T);
		};
	};

	getClasses (): Observable<Response[]> {
	  let url = apiUrl + '/accounts';
	  return this.http.get<Response[]>(url)
	    .pipe(
	      tap(heroes => console.log('accounts')),
	      catchError(this.handleError('getProducts', []))
	    );
	};

	getClass(id: any): Observable<Response[]> {
	  let url = apiUrl + '/accounts/' + id;
	  return this.http.get<Response[]>(url)
	  .pipe(
	    tap(heroes => console.log('fetched class')),
	    catchError(this.handleError('getClass', []))
	  );
	};

	addClass (clas: Accounts): Observable<Response[]> {
	  let url = apiUrl + '/accounts';
	  return this.http.post<Response[]>(url, clas, httpOptions).pipe(
	    tap(heroes => console.log('added accounts')),
	    catchError(this.handleError('accounts', []))
	  );
	};

	updateClass (id: number, clas: Accounts): Observable<Response[]> {
	  let url = apiUrl + '/classes/edit/' + id;
	  return this.http.post<Response[]>(url, clas, httpOptions).pipe(
	    tap(heroes => console.log('updated class')),
	    catchError(this.handleError('updateClass', []))
	  );
	};

  deleteClass(id: any): Observable<Response[]> {
    let url = apiUrl + '/accounts/' + id;
    return this.http.delete<Response[]>(url)
      .pipe(
        tap(heroes => console.log('fetched class')),
        catchError(this.handleError('deleteClass', []))
      );
  };

}
