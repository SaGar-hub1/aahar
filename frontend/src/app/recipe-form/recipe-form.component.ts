import { Component } from '@angular/core'; 
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatIconModule} from '@angular/material/icon';
import {MatDividerModule} from '@angular/material/divider';
import {MatButtonModule} from '@angular/material/button';
import { MatSelectModule } from '@angular/material/select';
import { FormsModule } from '@angular/forms';
import { MatDialogActions } from '@angular/material/dialog';



@Component({
  selector: 'app-recipe-form',
  standalone: true,
  imports: [MatDialogActions, MatFormFieldModule, MatInputModule, MatSelectModule, MatButtonModule, MatDividerModule, MatIconModule, FormsModule],
  templateUrl: './recipe-form.component.html',
  styleUrl: './recipe-form.component.scss'
})
export class RecipeFormComponent {

  recipeItem:any = {
    title: ``,
    type: ``,
    desc: ``, 
    imgurl: ``,
  }
  onSubmit(){
    console.log(this.recipeItem);
  }
}
