import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/internal/Observable";
import {Category} from "../dtos/category";
import {MAIN_URL} from "./userservice";

const URL="api/v1/users";

@Injectable()
export class Categoryservice {

  constructor(private http:HttpClient){

  }
  getAllCategory():Observable<Array<Category>>{
    return this.http.get<Array<Category>>(MAIN_URL+URL);
  }
  saveCategory(category:Category):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,Category);
  }
  deleteCategory(catid: number): Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+ URL + "/" + catid);
  }
}
