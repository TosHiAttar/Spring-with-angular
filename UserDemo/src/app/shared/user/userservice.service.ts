import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { User } from './user.model';
 

@Injectable()
export class UserserviceService {

  public API = 'localhost:2323';
  public USER_API = this.API + '/adduser';

  constructor(private http : HttpClient) { }

  getAll(): Observable<any>{
    return this.http.get('//localhost:2323/getuser');
  }

  save(user: User) : Observable<any>{

    let result : Observable<Object>;

   result=this.http.post('http://localhost:2323/adduser',user);

   return result;

  }

}

