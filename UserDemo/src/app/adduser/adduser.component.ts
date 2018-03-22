import { Component, OnInit } from '@angular/core';
import { UserserviceService} from '../shared/user/userservice.service';
import { NgForm } from '@angular/forms';
import { User } from '../shared/user/user.model';


@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.scss']
})
export class AdduserComponent implements OnInit {
  
  public result;
   users: Array<any>;
  constructor(private userService : UserserviceService) { }
  gotoList() {
    this.userService.getAll().subscribe(data => {
      this.users = data;
   });
  }

  ngOnInit() {
  }

save(userForm: NgForm){
  this.userService.save(userForm.value).subscribe(result =>{
   this.gotoList();
  });

}

}
