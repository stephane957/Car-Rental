import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';
import { SharedModule } from '../../modules/shared.module';

@Component({
  selector: 'app-sign-up-page',
  imports: [SharedModule],
  templateUrl: './sign-up-page.component.html',
  styleUrl: './sign-up-page.component.scss',
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class SignUpPageComponent implements OnInit {

  ngOnInit(): void { }

}
