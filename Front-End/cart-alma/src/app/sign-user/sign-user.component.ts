import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {User} from "../dtos/user";
import {Userservice} from "../services/userservice";
import {NgForm} from "@angular/forms";
import {Item} from "../dtos/item";

@Component({
  selector: 'app-sign-user',
  templateUrl: './sign-user.component.html',
  styleUrls: ['./sign-user.component.sass']
})
export class SignUserComponent implements OnInit {

  user:User=new User();
  selectedFile: File;
  users:Array<User>=[];
  selectedUser: User=new User();
  tempuser:User=null;
  manuallySelected:boolean=false;
  @ViewChild("frmSign") frmSign:NgForm;
  myFile: ElementRef;

  constructor(private userservice:Userservice) { }

  ngOnInit() {
    this.loadAllUsers();
  }

  // uploadFile(): void {
  //   // Let's extract the file
  //   let file = this.myFile.nativeElement.files[0];
  //   // Check whether there is a file exists
  //   if (file) {
  //     // If so, let's upload it
  //     this.userservice.uploadFile(file).subscribe(result=>{
  //
  //       if (result){
  //         alert("Upload successfully");
  //       }else{
  //         alert("Failed to upload");
  //       }
  //     });
  //   }
  // }

  loadAllUsers(): void {
    this.userservice.getAllUsers().subscribe(
      (result) => {
        this.users = result;
        console.log(this.users);
      }
    )
  }
  selectUsers(user: User): void {
    this.clear();
    this.selectedUser = user;
    this.tempuser = Object.assign({}, user);
    this.manuallySelected = true;
  }
  saveUser(): void{
    this.userservice.saveUser(this.selectedUser).subscribe(
      (result)=>{
        if (result){
          console.log(this.selectedUser);
          alert("User has been saved successfully");
          this.loadAllUsers();
        }else{
          alert("Failed to save the user");
        }
      }
    );
  }
  clear(): void {
    let index = this.users.indexOf(this.selectedUser);

    if (index !== -1) {
      this.users[index] = this.tempuser;
      this.tempuser = null;
    }
    this.selectedUser = new User();
    this.manuallySelected = false;
  }
}
