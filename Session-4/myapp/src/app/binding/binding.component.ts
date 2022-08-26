import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  name:string ="NIKUNJ SONI";
  url:string="http://www.google.com";

  products=[{name:"pencile",price:"8.3",available:"26-08-2022",ratings:4.8},
  {name:"pen",price:"8.8",available:"27-08-2022",ratings:5.0},
  {name:"eraser",price:"5.5",available:"31-08-2022",ratings:4.2},
  {name:"scale",price:"3.3",available:"01-09-2022",ratings:4.1},
  {name:"books",price:"10",available:"05-09-2022",ratings:4.9}
]

we:number=700;
}
