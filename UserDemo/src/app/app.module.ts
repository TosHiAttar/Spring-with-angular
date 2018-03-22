import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { NgModule, NO_ERRORS_SCHEMA } from '@angular/core';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { UserserviceService } from './shared/user/userservice.service';
import { HttpClientModule } from '@angular/common/http';
import {UserListComponent} from './user-list/user-list.component';
import { AdduserComponent } from './adduser/adduser.component';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
   UserListComponent,
   AdduserComponent
  ],
  imports: [
    BrowserModule,
    MDBBootstrapModule.forRoot(),
    AppRoutingModule,
    HttpClientModule,
    FormsModule
    
  ],
  schemas: [ NO_ERRORS_SCHEMA ],
  providers: [UserserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
