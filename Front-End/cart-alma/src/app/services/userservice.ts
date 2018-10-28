import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../dtos/user";
import {userError} from "@angular/compiler-cli/src/transformers/util";

export const MAIN_URL="http://localhost:8080";
const URL="/api/v1/users";

@Injectable()

export class Userservice {

  constructor(private http:HttpClient){}
  //
  // public uploadFile(myFile: File):Observable<boolean>{
  //   let myFormData = new FormData();
  //   myFormData.append("myFile",myFile,myFile.name);
  //   return this.http.put<boolean>("http://localhost:8080/api/v1/test",myFormData);
  // }

  getAllUsers(): Observable<Array<User>>{
    return this.http.get<Array<User>>(MAIN_URL + URL);
  }

  deleteUser(userID: number): Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+ URL + "/" + userID);
  }

  saveUser(user: User): Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL + URL,user);
  }

  getTotalUsers(): Observable<number>{
    return this.http.get<number>(MAIN_URL + URL + "/count");
  }

  searchUser(userfname :String): Observable<User>{
    return this.http.get<User>(MAIN_URL + URL + "/"+userfname);
  }
}
