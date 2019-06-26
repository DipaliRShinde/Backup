import { TestBed } from '@angular/core/testing';

import { RestarantService } from './restarant.service';

describe('RestarantService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RestarantService = TestBed.get(RestarantService);
    expect(service).toBeTruthy();
  });
});
