import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { UserService } from './user.service';
import { ServicedemoComponent } from './servicedemo/servicedemo.component';
import { DirectiveComponent } from './directive/directive.component';
import { ChangeColorDirective } from './CHangeColorDirective';
import { HighLightDirective } from './HightLightDirective';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    ServicedemoComponent,
    DirectiveComponent,
    ChangeColorDirective,
    HighLightDirective
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [UserService],//registering service
  bootstrap: [AppComponent]
})
export class AppModule { }
