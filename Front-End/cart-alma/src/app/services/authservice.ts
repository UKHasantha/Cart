import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../dtos/user";
import {Observable} from "rxjs/index";
import {MAIN_URL} from "./userservice";
import {map} from "rxjs/internal/operators";
import {Router} from "@angular/router";

const URL = "/api/v1/loginuser";

@Injectable()
export class AuthService {

  constructor(private http: HttpClient, private router: Router) {

  }

  loginuser(user: User): Observable<boolean> {
    return this.http.post<boolean>(MAIN_URL + URL, user)
      .pipe(map((result) => {
          sessionStorage.setItem("token", result + "");
          if (result) {
            this.router.navigate(['/theame-home']);
          }
          return result;
        })
      )
  }


  isAuthenticated(): boolean {
    if (sessionStorage.getItem("token")) {
      return sessionStorage.getItem("token") == 'false' ? false : true;
    }
  }

  logout(): void {
    sessionStorage.removeItem("token");
    this.router.navigate(['/login-user']);
  }
}
