import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-servicedemo',
  templateUrl: './servicedemo.component.html',
  styleUrls: ['./servicedemo.component.css']
})
export class ServicedemoComponent implements OnInit {

  //DI of service
  constructor(private service:UserService) { }

  ngOnInit(): void {
  }

}
