import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {User} from "../dtos/user";
import {Orderdetails} from "../dtos/orderdetails";
import {Item} from "../dtos/item";
import {OrderdetailsPk} from "../dtos/orderdetails-pk";
import {PlaceOrder} from "../dtos/place-order";
import {Orders} from "../dtos/orders";
import {NgForm} from "@angular/forms";
import {PlaceOrderService} from "../services/place-order-service";
import {Userservice} from "../services/userservice";
import {ItemService} from "../services/itemservice";

@Component({
  selector: 'app-add-orders',
  templateUrl: './add-orders.component.html',
  styleUrls: ['./add-orders.component.sass']
})

export class AddOrdersComponent implements OnInit {

  users:Array<User>=[];
  selectedItems:Array<Orderdetails>=[];
  searchedItems:Item=new Item();
  searchedUsers:User=new User();
  orderdetails_pkdto:OrderdetailsPk;
  orderdetails:Orderdetails;
  items:any=[];
  placeorder:PlaceOrder;
  orders:Orders;
  total:number=0;

  @ViewChild("frmitems") frmItems:NgForm;

  constructor(private placeOrderService:PlaceOrderService,
              private userService:Userservice,
              private itemService:ItemService,
              private elm:ElementRef) {

  }

  ngOnInit() {
    this.getUserId();
  }

  getUserId(): void{
    this.userService.getAllUsers().subscribe(
      (result)=>{
        this.users=result;
        console.log(this.users);
      }
    )
  }

}
