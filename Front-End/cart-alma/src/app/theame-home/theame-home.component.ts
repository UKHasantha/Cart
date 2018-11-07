import {Component, OnInit, ViewChild} from '@angular/core';
import {Categoryservice} from "../services/categoryservice";
import {NgForm} from "@angular/forms";
import {Category} from "../dtos/category";

@Component({
  selector: 'app-theame-home',
  templateUrl: './theame-home.component.html',
  styleUrls: ['./theame-home.component.sass']
})
export class TheameHomeComponent implements OnInit {


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
}
