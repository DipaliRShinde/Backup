import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
        <h2 *ngIf="true"> Dipali </h2>
        <h2 *ngIf="displayName"> Dipali </h2>
        <h2 *ngIf="displayName; else elseBlock"> If Part </h2>

        <ng-template #elseBlock>
          <h2>Else Part</h2>
        </ng-template>

        <div *ngIf="displayName; then thenBlock; else elseBlock1"> If Part </div>

        <ng-template #thenBlock>
          <h2>IF Part1</h2>
        </ng-template>

        <ng-template #elseBlock1>
          <h2>Else Part1</h2>
        </ng-template>

        <div [ngSwitch]="color">
          <div *ngSwitchCase="'red'"> Red </div>
          <div *ngSwitchCase="'blue'"> Blue </div>
          <div *ngSwitchCase="'green'"> Green </div>
          <div *ngSwitchDefault> Pick Again </div>
        </div>

        <div *ngFor="let color of colors; index as i; first as f; last as l; even as e; odd as o">
          <h2>{{i}} {{color}} {{f}} {{l}} {{e}} {{o}}</h2>
        </div>

  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  public displayName = true
  public color = "blue";
  public colors = ["red", "blue", "green", "yellow"];

  constructor() { }

  ngOnInit() {
  }

}
