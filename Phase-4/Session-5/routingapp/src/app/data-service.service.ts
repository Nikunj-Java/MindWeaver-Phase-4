import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { UserClass } from './UserClass';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {
  
  //url:https://jsonplaceholder.typicode.com/users

  url:string ="https://jsonplaceholder.typicode.com/users";

  //injcet DI

  constructor(private http:HttpClient) { }


  getAlluser():Observable<UserClass[]>{
    return this.http.get<UserClass[]>(this.url);
  }
}
