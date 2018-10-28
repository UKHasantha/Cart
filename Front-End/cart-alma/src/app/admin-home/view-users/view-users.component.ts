import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {User} from "../../dtos/user";
import {NgForm} from "@angular/forms";
import {Userservice} from "../../services/userservice";

@Component({
  selector: 'app-view-users',
  templateUrl: './view-users.component.html',
  styleUrls: ['./view-users.component.sass']
})
export class ViewUsersComponent implements OnInit {

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

  // saveUser(): void{
  //   this.userservice.saveUser(this.selectedUser).subscribe(
  //     (result)=>{
  //       if (result){
  //         console.log(this.selectedUser);
  //         alert("User has been saved successfully");
  //         this.loadAllUsers();
  //       }else{
  //         alert("Failed to save the user");
  //       }
  //     }
  //   )
  // }

  clear(): void {
    let index = this.users.indexOf(this.selectedUser);

    if (index !== -1) {
      this.users[index] = this.tempuser;
      this.tempuser = null;
    }
    this.selectedUser = new User();
    this.manuallySelected = false;
  }


  deleteUser(user: User): void {
    if (confirm("Are you sure you want to delete this User?")) {
      this.userservice.deleteUser(user.userID)
        .subscribe((result) => {
          if (result) {
            alert("User has been deleted successfully");
          } else {
            alert("Failed to delete the User");
          }
          this.loadAllUsers();
        })
    }
  }
}
