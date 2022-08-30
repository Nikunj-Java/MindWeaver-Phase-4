import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../data-service.service';
import { UserClass } from '../UserClass';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  //inject the service

  constructor(private service:DataServiceService) { }

  users:UserClass[];
  ngOnInit(): void {

    this.service.getAlluser().subscribe(result=>this.users=result);


  }

}
