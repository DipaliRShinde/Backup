import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-component2',
  template: `
          <h2>
              {{parentData}}
          </h2>
          
  `,
  styleUrls: ['./component2.component.css']
})
export class Component2Component implements OnInit {

  @Input() public parentData;

  constructor() { }

  ngOnInit() {
  }
}
