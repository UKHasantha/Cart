import {Component, OnInit, ViewChild} from '@angular/core';
import {Category} from "../../dtos/category";
import {NgForm} from "@angular/forms";
import {Categoryservice} from "../../services/categoryservice";
import {Item} from "../../dtos/item";

@Component({
  selector: 'app-view-categories',
  templateUrl: './view-categories.component.html',
  styleUrls: ['./view-categories.component.sass']
})
export class ViewCategoriesComponent implements OnInit {

  categories:Array<Category>=[];
  selectedcategories:Category=new Category();
  tempcat:Category=null;
  manuallyselected:boolean=false;
  @ViewChild("frmcategory")frmcategory:NgForm;

  constructor(private categoryservice:Categoryservice) { }

  ngOnInit() {
    this.loadAllCategory();
  }
  loadAllCategory():void{
    this.categoryservice.getAllCategory().subscribe(
      (result)=>{
        this.categories=result;
        console.log(this.categories);
      }
    )
  }
  selectcategory(category: Category): void {
    this.selectedcategories = category;
    this.tempcat = Object.assign({}, category);
    this.manuallyselected = true;
  }
  deletecategory(category:Category):void {
    if (confirm("If you want to delete catogery ?")){
      this.categoryservice.deleteCategory(Number(category.catid)).subscribe(
        (result)=>{
          if (result) {
            alert("Category has been delete success...");
          }else {
            alert("Failed to delete success...");
          }
          this.loadAllCategory();
        })
    }
  }
}
