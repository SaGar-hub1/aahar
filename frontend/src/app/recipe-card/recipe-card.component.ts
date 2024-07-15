import { ChangeDetectionStrategy, Component } from '@angular/core';
import {MatButtonModule} from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';
import { MatDialog } from '@angular/material/dialog';
import { MatIcon } from '@angular/material/icon';
import { UpdateRecipeComponent } from '../update-recipe/update-recipe.component';

@Component({
  selector: 'app-recipe-card',
  standalone: true,
  imports: [MatIcon, MatCardModule, MatButtonModule],changeDetection: ChangeDetectionStrategy.OnPush,
  templateUrl: './recipe-card.component.html',
  styleUrl: './recipe-card.component.scss'
})
export class RecipeCardComponent {
  constructor(public dialog:MatDialog){}
    
  updaterecipeform() {
    this.dialog.open(UpdateRecipeComponent);
  }

}
