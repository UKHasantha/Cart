import { Injectable } from '@angular/core';
import {CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router} from '@angular/router';
import { Observable } from 'rxjs';
import {AuthService} from "../services/authservice";

@Injectable()
export class AuthGuard implements CanActivate {

  constructor(private authService: AuthService,private router: Router){

  }

  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean> | Promise<boolean> | boolean {

    if (!this.authService.isAuthenticated()){
      this.router.navigate(['/login-user']);
      return false;
    }
    return true;
  }
}
