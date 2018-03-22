import { Component, OnInit } from '@angular/core';
import { UserserviceService} from '../shared/user/userservice.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.scss']
})
export class UserListComponent implements OnInit {

  users: Array<any>;

  constructor(private userService : UserserviceService) { }

  ngOnInit() {
    this.userService.getAll().subscribe(data => {
       this.users = data;
    });
  }

}
