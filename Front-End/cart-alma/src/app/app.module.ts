import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import {RouterModule} from "@angular/router";
import {AuthService} from "./services/authservice";
import {AuthGuard} from "./guards/auth.guard";
import {Userservice} from "./services/userservice";
import {LoginUserComponent} from "./login-user/login-user.component";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import { SignUserComponent } from './sign-user/sign-user.component';
import { LoginAdminComponent } from './admin-panel/login-admin/login-admin.component';
import { ViewUsersComponent } from './admin-home/view-users/view-users.component';
import { ViewItemsComponent } from './admin-home/view-items/view-items.component';
import { ViewCategoriesComponent } from './admin-home/view-categories/view-categories.component';
import { ViewOrdersComponent } from './admin-home/view-orders/view-orders.component';
import { TheameHomeComponent } from './theame-home/theame-home.component';
import {ItemService} from "./services/itemservice";
import {SignUserComponentCadeactivateGuard} from "./guards/sign-user-component-cadeactivate.guard";
import {Categoryservice} from "./services/categoryservice";
import { AddOrdersComponent } from './add-orders/add-orders.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginUserComponent,
    SignUserComponent,
    LoginAdminComponent,
    ViewUsersComponent,
    ViewItemsComponent,
    ViewCategoriesComponent,
    ViewOrdersComponent,
    TheameHomeComponent,
    AddOrdersComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([{
      path: 'home',
      component: HomeComponent
    },
      {
        path:'login-user',
        component:LoginUserComponent
      },
      {
        path:'sign-user',
        component:SignUserComponent,
        canDeactivate:[SignUserComponentCadeactivateGuard]
      },
      {
        path:'login-admin',
        component:LoginAdminComponent
      },
      {
        path:'theame-home',
        component:TheameHomeComponent
      },
      {
        path:'view-item',
        component:ViewItemsComponent
      },
      {
        path:'view-user',
        component:ViewUsersComponent
      },
      {
        path:'view-category',
        component:ViewCategoriesComponent
      },
      {
        path:'add-orders',
        component:AddOrdersComponent
      },
      {
        path:'',
        pathMatch:'full',
        redirectTo:'/home'
      }
    ])
  ],
  providers: [
    AuthService,
    AuthGuard,
    Userservice,
    ItemService,
    Categoryservice
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
