import { Component, OnInit } from '@angular/core';
import {User} from "../dtos/user";
import {AuthService} from "../services/authservice";

@Component({
  selector: 'app-login-user',
  templateUrl: './login-user.component.html',
  styleUrls: ['./login-user.component.sass']
})
export class LoginUserComponent implements OnInit {

  user:User = new User();
  failed:boolean;

  constructor(private authservice:AuthService) { }

  ngOnInit() {
  }

  login():void{
    this.authservice.loginuser(this.user).subscribe(
      (result)=>{
        this.failed=!result;
      }
    );
  }

}
