import {Component, OnInit, ViewChild} from '@angular/core';
import {Item} from "../../dtos/item";
import {NgForm} from "@angular/forms";
import {ItemService} from "../../services/itemservice";

@Component({
  selector: 'app-view-items',
  templateUrl: './view-items.component.html',
  styleUrls: ['./view-items.component.sass']
})
export class ViewItemsComponent implements OnInit {

  items:Array<Item>=[];
  selectedItem:Item=new Item();
  tempItem:Item=null;
  manuallyselected:boolean=false;
  @ViewChild("frmItems")frmItems:NgForm;

  constructor(private itemservice:ItemService) { }

  ngOnInit() {
    this.loadAllItem();
  }
  clear(): void {
    let index = this.items.indexOf(this.selectedItem);

    if (index !== -1) {
      this.items[index] = this.tempItem;
      this.tempItem = null;
    }
    this.selectedItem = new Item();
    this.manuallyselected = false;
  }

  loadAllItem():void{
    this.itemservice.getAllItems().subscribe(
      (result)=>{
        this.items=result;
        console.log(this.items);
      }
    )
  }
  selectItems(item: Item): void {
    this.clear();
    this.selectedItem = item;
    this.tempItem = Object.assign({}, item);
    this.manuallyselected = true;
  }
  saveItems():void {
    this.itemservice.saveItems(this.selectedItem).subscribe(
      (result) => {
        if (result) {
          console.log(this.selectedItem)
          alert("Items has been saved successfully");
        } else {
          alert("Failed to save the Items");
        }
      }
    )
  }
}
