"""
Parte III - Grafica de tiempo de solucion vs. numero de hilos.
Datos tomados de PartIIIExperiment sobre la IP dispersa 202.24.34.55.
"""
# Generado con AI Chat-Gpt
import matplotlib.pyplot as plt

hilos = [1, 12, 24, 50, 100, 10000, 50000]
tiempo_ms = [124310, 9879, 4998, 2355, 1178, 786, 4406]
etiquetas = ["1\n(secuencial)", "12\n(nucleos)", "24\n(2x nucleos)", "50", "100", "10000", "50000"]

fig, ax = plt.subplots(figsize=(8, 5))

ax.plot(range(len(hilos)), tiempo_ms, marker='o', color='#2a78d6', linewidth=2)

for i, t in enumerate(tiempo_ms):
    ax.annotate(f"{t:,} ms", (i, t), textcoords="offset points", xytext=(0, 10), ha='center', fontsize=9)

ax.set_xticks(range(len(hilos)))
ax.set_xticklabels(etiquetas)
ax.set_xlabel("Numero de hilos")
ax.set_ylabel("Tiempo de ejecucion (ms)")
ax.set_title("Tiempo de solucion vs. numero de hilos\ncheckHost(\"202.24.34.55\", n) - 80.000 listas negras")
ax.grid(True, axis='y', linestyle='--', alpha=0.4)

fig.tight_layout()
fig.savefig("parte3_grafica.png", dpi=150)
print("Grafica guardada")
