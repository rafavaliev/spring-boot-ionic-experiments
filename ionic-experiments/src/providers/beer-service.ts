import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class BeerService {
  public API = 'http://localhost:8080';
  public BEER_API = this.API + '/beers';

  constructor(public http: HttpClient) {
  }

  getGoodBeers(): Observable<any> {
    return this.http.get(this.API + '/good-beers');
  }
}
