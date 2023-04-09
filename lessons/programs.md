# An example computer program 

In this lesson we will write a computer program that generates the digits of pi. We will use the [numpy](https://numpy.org/) library to generate the digits of pi. We will use the [matplotlib](https://matplotlib.org/) library to plot the digits of pi.


```python
import numpy as np
import matplotlib.pyplot as plt

# generate digits of pi
pi = np.pi
digits = np.array([int(d) for d in str(pi)[2:]])

# plot digits of pi
plt.plot(digits)

# show plot
plt.show()
```

    /usr/local/lib/python3.7/site-packages/matplotlib/backends/backend_agg.py:238: RuntimeWarning: Glyph 120792 missing from current font.
      font.set_text(s, 0.0, flags=flags)
    /usr/local/lib/python3.7/site-packages/matplotlib/backends/backend_agg.py:238: RuntimeWarning: Glyph 120793 missing from current font.
      font.set_text(s, 0.0, flags=flags)
    /usr/local/lib/python3.7/site-packages/matplotlib/backends/backend_agg.py:238: RuntimeWarning: Glyph 120794 missing from current font.
      font.set_text(s, 0.0, flags=flags)
    /usr/local/lib/python3.7/site-packages/matplotlib/backends/backend_agg.py:238: RuntimeWarning: Glyph 120795 missing from current font.
      font.set_text(s, 0.0, flags=flags)
    /usr/local/lib/python3.7/site-packages/matplotlib/backends/backend_agg.py:238: RuntimeWarning: Glyph 120796 missing from current font.
      font.set_text(s, 0.0, flags=flags)
    /usr/local/lib/python3.7/site-packages/matplotlib/backends/backend_agg.py:238: RuntimeWarning: Glyph 120797 missing from current font.
      font.set_text(s, 0.0, flags=flags)
    /usr/local/lib/python3.7/site-packages/matplotlib/backends/backend_agg.py:238: RuntimeWarning: Glyph 120798 missing from current font.
      font.set_text(s, 0.0, flags=flags)
    /usr/local/lib/python3.7/site-packages/matplotlib/backends/backend_agg.py:238: RuntimeWarning: Glyph 120799 missing from current font.
      font.set_text(s, 0.0, flags=flags)
    /usr/local/lib/python3.7/site-packages/matplotlib/backends/backend_agg.py:238: RuntimeWarning: Glyph 120800 missing from current font.
      font.set_text(s, 0.0, flags=flags)
    /usr/local/lib/python3.7/site-packages/matplotlib/backends/backend_agg.py:238: RuntimeWarning: Glyph 120801 missing from current font.
      font.set_text(s, 0.0, flags=flags)
    /usr/local/lib/python3.7/site-packages/matplotlib/back
    (hihi easter egg)
```