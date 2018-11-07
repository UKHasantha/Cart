import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";
import {Admin} from "../dtos/admin";
import {Observable} from "rxjs/index";
import {map} from "rxjs/internal/operators";
import {MAIN_URL} from "./userservice";

const URL="/api/v1/adminlogin";

@Injectable()
export class Adminauthservice {

  constructor(private http:HttpClient,private route:Router){
  }


  loginadmin(admin: Admin): Observable<boolean> {
    return this.http.post<boolean>(MAIN_URL + URL, admin)
      .pipe(map((result)=>{
          sessionStorage.setItem("token", result + "");
          if (result){
            this.route.navigate(['/main']);
          }
          return result;
        })
      )
  }

  isAuthenticated(): boolean{
    if (sessionStorage.getItem("token")){
      return sessionStorage.getItem("token") == 'false' ? false: true;
    }
  }

  logout(): void{
    sessionStorage.removeItem("token");
    this.route.navigate(['/login-user']);
  }
}
