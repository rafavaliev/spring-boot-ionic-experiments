import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { BeerService } from "../../providers/beer-service";

/**
 * Generated class for the BeerPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-beer',
  templateUrl: 'beer.html',
})
export class BeerPage {
  private beers: Array<any>;

  constructor(public navCtrl: NavController,
              public navParams: NavParams,
              public beerService: BeerService) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad BeerPage');
    this.beerService.getGoodBeers().subscribe(beers => {
      this.beers = beers;
    })
  }

}
