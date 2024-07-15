import { Component } from '@angular/core';
import { RecipeCardComponent } from "../recipe-card/recipe-card.component";
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatDialog } from '@angular/material/dialog';
import { RecipeFormComponent } from '../recipe-form/recipe-form.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RecipeCardComponent, MatIconModule, MatButtonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
recipes=[1,2,3,4,5,6];

constructor(public dialog: MatDialog){}

openrecipeform(){
this.dialog.open(RecipeFormComponent);
}
}
