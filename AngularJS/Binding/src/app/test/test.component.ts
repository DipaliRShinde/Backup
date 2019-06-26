import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
        <h2>
          Welcome {{name}}
        </h2>
        <h2>{{2+2}}</h2>
        <h2>{{"Welcome " + name}}</h2>
        <h2>{{name.length}}</h2>
        <h2>{{name.toUpperCase()}}</h2>
        <h2>{{name.toLowerCase()}}</h2>
        <h2>{{greetUser()}}</h2>
        <h2>{{siteUrl }}</h2>

        <input [id]="myId" type="text" value="Dipali">
        <input [disabled]="false" id="{{myId}}" type="text" value="Dipali">
        <input bind-disabled="isDisabled" id="{{myId}}" type="text" value="Dipali">
(
        <h2 class="text-success">{{name}}</h2>
        <h2 [class]="successClass">{{name}}</h2>
        <h2 class="text-success" [class]="successClass">{{name}}</h2>
        <h2 [class.text-danger]="hasError">{{name}}</h2>
        <h2 [ngClass]="messageClasses">{{name}}</h2>

        <h2 [style.color]="'orange'">Style Binding</h2>
        <h2 [style.color]="hasError ? 'red' : 'green'">Style Binding</h2>
        <h2 [style.color]="highlightColor">Style Binding</h2>
        <h2 [ngStyle]="titleStyle">Style Binding</h2>

        <button (click)="onClick()">Greet</button>
        <button (click)="onClick($event)">Greet</button>
        {{greetings}}

        <input #myInput type="text">
        <button (click)="logMessage(myInput.value)">Log</button>

        <input [(ngModel)]="name1" type="text">
        {{name1}}

  `,
  styles: [`
        .text-success {
          color: green;
        }
        .text-danger {
          color: red;
        }
        .text-special {
          font-style: italic;
        }
  `]
})
export class TestComponent implements OnInit {

  public name = "Dipali";
  public myId = "testId";
  public isDisabled = false;
  public successClass = "text-success";
  public hasError = true;
  public isSpecial = true;
  public highlightColor = "orange";
  public greetings = ' ';
  public name1=" ";

  public logMessage(value) {
    console.log(value);
  }

  public onClick(event) {
          console.log(event);
          this.greetings = event.type;
  }

  public titleStyle = {
    color : "blue",
    fontStyle : "italic"
  }

  public messageClasses = {
    "text-success" : !this.hasError,
    "text-danger" : this.hasError,
    "text-special" : this.isSpecial
  }

  constructor() { }

  ngOnInit() {
  }

  public siteUrl = window.location.href;

  greetUser() {
    return "Hello " + this.name;
  }
}
