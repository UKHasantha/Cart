import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/index";
import {Item} from "../dtos/item";
import {MAIN_URL} from "./userservice";

const URL="/api/v1/items";

@Injectable()
export class ItemService {

  constructor(private http: HttpClient) {

  }

  getAllItems(): Observable<Array<Item>> {
    return this.http.get<Array<Item>>(MAIN_URL + URL);

  }

  saveItems(item: Item): Observable<boolean> {
    return this.http.post<boolean>(MAIN_URL + URL, item);
  }

}
