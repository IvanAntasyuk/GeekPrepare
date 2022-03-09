import {Component, OnInit} from '@angular/core';
import {UserServiceService} from "../service/user-service.service";
import {ActivatedRoute, Router} from "@angular/router";
import {User} from '../service/user';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.scss']
})
export class UserFormComponent implements OnInit {

  public user: User = new User(null, "", "", "");

  constructor(private userService: UserServiceService,
              private route: ActivatedRoute,
              public router: Router) {
  }

  ngOnInit(): void {
    this.route.params.subscribe(param => {
      if (param["id"] == "new") {
        this.user = new User(null, "", "", "");
      }
      this.userService.findById(param["id"])
        .subscribe(user=>{
          this.user = user;
        },error =>
        console.log(error));
    });
  }

}
