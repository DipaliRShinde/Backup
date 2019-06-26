import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-component1',
  template: `
        <input #myInput type="text">
        <button (click)="onClick(myInput.value)">Log</button>
  `,
  styleUrls: ['./component1.component.css']
})
export class Component1Component implements OnInit {

  public onClick(value) {
    console.log(value);
  }
  
  constructor() { }

  ngOnInit() {
  }

}
