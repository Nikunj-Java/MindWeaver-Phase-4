import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe-demo',
  templateUrl: './pipe-demo.component.html',
  styleUrls: ['./pipe-demo.component.css']
})
export class PipeDemoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  name:string ="My Name is Nikunj And i am Java FSD Trainer";
  pi:number=3.1415927;
  a=0.12345;
  b=9876.5432;
  today=new Date();
  object={name:"nikunj",email:"test@gmail.com",address:"mumbai,india"};

  //custom pipes
  cust:string ="welcome to the world of CustomPipes"

}
