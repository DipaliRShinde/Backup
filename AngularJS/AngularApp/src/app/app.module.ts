import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule }  from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RestaurantService } from './restaurant.service';



@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [RestaurantService],
  bootstrap: [AppComponent]
})


export class AppModule { }
