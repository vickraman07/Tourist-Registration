import { Component, OnInit } from '@angular/core';
import { UserRegistrationService } from '../user-registration.service';

@Component({
  selector: 'app-search-delete',
  templateUrl: './search-delete.component.html',
  styleUrls: ['./search-delete.component.css']
})
export class SearchDeleteComponent implements OnInit {
  users:any;
  id:number | undefined;

  constructor(private service:UserRegistrationService) { }

  public delteUser(id:number){
    let resp= this.service.deleteUser(id);
    resp.subscribe((data)=>this.users=data);
    alert("DELETED SUCESSFULL");
   }

  ngOnInit(): void {
    let resp=this.service.getUsers();
    resp.subscribe((data)=>this.users=data);
  
  }

}
