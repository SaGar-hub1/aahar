import { ChangeDetectionStrategy, Component, signal} from '@angular/core';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatIconModule} from '@angular/material/icon';
import {MatDividerModule} from '@angular/material/divider';
import {MatButtonModule} from '@angular/material/button';
import { MatSelectModule } from '@angular/material/select';
import { EmailValidator, FormControl, FormGroup, FormsModule, Validators, ReactiveFormsModule } from '@angular/forms';
import { MatDialogActions } from '@angular/material/dialog';
import { MatCard, MatCardContent } from '@angular/material/card';



@Component({
  selector: 'app-auth',
  standalone: true,
  imports: [MatDialogActions, MatFormFieldModule, MatInputModule, MatSelectModule, MatButtonModule, MatDividerModule, MatIconModule, FormsModule,MatCard, MatCardContent, MatIconModule, ReactiveFormsModule],changeDetection: ChangeDetectionStrategy.OnPush,
  templateUrl: './auth.component.html',
  styleUrl: './auth.component.scss'
})
export class AuthComponent {
  hide = signal(true);
  clickEvent(event: MouseEvent) {
    this.hide.set(!this.hide());
    event.stopPropagation();
  }
  recipeItem:any = {
    title: ``,
    type: ``,
    desc: ``, 
    imgurl: ``,
  }
 
  registerationForm=new FormGroup({
    fullName: new FormControl("",[Validators.required]),
    email: new FormControl("",[Validators.required, Validators.email]),
    password:new FormControl("",[Validators.required, Validators.minLength(6)]),
  })

  loginForm=new FormGroup({
    email: new FormControl("",[Validators.required, Validators.email]),
    password:new FormControl("",[Validators.required, Validators.minLength(6)]),
  })

  handleRegister(){
    console.log("Registe", this.registerationForm);
  }
  handleLogin(){
    console.log("Registe", this.loginForm);
  }
}
