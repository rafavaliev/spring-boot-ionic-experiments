import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { BeerPage } from './beer';
import { BeerService } from "../../providers/beer-service";

@NgModule({
  declarations: [
    BeerPage,
  ],
  imports: [
    IonicPageModule.forChild(BeerPage),
  ],
  providers: [
    BeerService,
  ]
})
export class BeerPageModule {}