import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

// API KEY ca9c54d8e8ae2112df70952f8c0050c5
@Injectable({
  providedIn: 'root'
})
export class RestaurantService {

  constructor(private http: HttpClient) { }

  getAllRestaurants() {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
        'user-key': 'ca9c54d8e8ae2112df70952f8c0050c5'
      })
    };
    return this.http.get('https://developers.zomato.com/api/v2.1/search', httpOptions)
  }
}
