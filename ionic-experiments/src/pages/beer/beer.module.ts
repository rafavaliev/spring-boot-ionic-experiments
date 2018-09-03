import { FormsModule } from '@angular/forms';
import { MbscModule } from '@mobiscroll/angular';
import {NgModule} from '@angular/core';
import {IonicPageModule} from 'ionic-angular';
import {BeerPage} from './beer';
import {BeerService} from "../../providers/beer-service";
import {GiphyService} from "../../providers/giphy-service";
import {BeerModalPage} from "./beer-modal";

@NgModule({
  declarations: [
    BeerPage,
    BeerModalPage,
  ],
  imports: [ 
    FormsModule, 
    MbscModule,
    IonicPageModule.forChild(BeerPage),
  ],
  providers: [
    BeerService,
    GiphyService,
  ],
  entryComponents: [
    BeerModalPage
  ],
})
export class BeerPageModule {
}
