import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { ReservarComponent } from './components/reservar/reservar.component';
import {NgbModule} from 'bootstrap';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ReservarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
