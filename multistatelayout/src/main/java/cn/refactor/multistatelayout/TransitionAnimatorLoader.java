/**
 * Copyright 2017 andy (https://github.com/andyxialm)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.refactor.multistatelayout;

import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by andy (https://github.com/andyxialm)
 * Creation time: 17/2/9 18:15
 * Description: animator loader
 */
public interface TransitionAnimatorLoader {

    /**
     *
     * @param targetView  target view
     * @return animator
     */
    ObjectAnimator onCreateAnimator(View targetView);
}
