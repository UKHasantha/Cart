import {Item} from "./item";
import {OrderdetailsPk} from "./orderdetails-pk";
import {Orders} from "./orders";

export class Orderdetails {
  quantity:number;
  unitprice:number;
  order:Orders;
  item:Item;
  orderDetails_pkdto:OrderdetailsPk;
}
