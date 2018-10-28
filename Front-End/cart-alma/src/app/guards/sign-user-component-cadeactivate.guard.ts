import { Injectable } from '@angular/core';
import {SignUserComponent} from "../sign-user/sign-user.component";
import {CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, CanDeactivate} from '@angular/router';
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class SignUserComponentCadeactivateGuard implements CanDeactivate<SignUserComponent> {
  canDeactivate(component:SignUserComponent, currentRoute:ActivatedRouteSnapshot,currentStateSnapshot,
                nextState?:RouterStateSnapshot):
    Observable<boolean>|Promise<boolean>|boolean{
    if (component.frmSign.dirty){
      return confirm("Are you sure you want to discard your changes?")
    }
    return true;
  }
}
