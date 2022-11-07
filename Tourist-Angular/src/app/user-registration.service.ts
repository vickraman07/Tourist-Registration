import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserRegistrationService {

  constructor(private http:HttpClient) { }

  public doRegistration(user: User){
    return this.http.post("http://localhost:9001/tourist/addTourist",user,{responseType:'text' as 'json'});
  }

  public getUsers(){
    return this.http.get("http://localhost:9001/tourist/name");
  }

  public deleteUser(id: number){
    return this.http.delete("http://localhost:9001/tourist/delete/"+id);
  }
}
